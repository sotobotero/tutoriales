FROM php:7.2.0-apache
#php:7.0.3-apache
MAINTAINER carlos soto carlos@marketexpert.org
RUN apt-get clean &&  apt-get update; \
    apt-get install -y gcc make autoconf libgmp-dev libfreetype6-dev libjpeg62-turbo-dev libpng-dev libxml++2.6-dev libicu-dev g++ libmcrypt-dev; \
    pecl config-set php_ini "${PHP_INI_DIR}/php.ini";\
    pecl install mcrypt-1.0.1 &&  docker-php-ext-enable mcrypt \
    && docker-php-ext-configure gd --with-freetype-dir=/usr/include/ --with-jpeg-dir=/usr/include/ \
    && docker-php-ext-install -j$(nproc) intl pdo_mysql bcmath mbstring exif gd 
#   mkdir /etc/apache2/sites-available 
#   mkdir /etc/apache2/sites-enabled
COPY ./market_expert.conf /etc/apache2/sites-available/ 
COPY ./*.cer /etc/ssl/certs/ 
COPY ./*.key /etc/ssl/certs/
COPY ./default-ssl.conf /etc/apache2/sites-available/
RUN ln -s /etc/apache2/sites-available/market_expert.conf /etc/apache2/sites-enabled; \
    ln -s /etc/apache2/sites-available/default-ssl.conf /etc/apache2/sites-enabled; \
    cd  /etc/apache2/sites-available/; \
    a2dissite 000-default.conf; \
    a2enmod ssl; \
    a2enmod headers; \
    a2enmod rewrite;\
#    a2densite default-ssl.conf; \  
    service apache2 reload; \
    apt-get install --no-install-recommends --no-install-suggests -y vim
