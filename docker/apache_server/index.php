<?php
        $user = "apacheweb";
        $pass = "1232la";
        $host = "mariadb";
        $db = "market_expert";
        $charset = 'utf8mb4';

   $options = [
    \PDO::ATTR_ERRMODE            => \PDO::ERRMODE_EXCEPTION,
    \PDO::ATTR_DEFAULT_FETCH_MODE => \PDO::FETCH_ASSOC,
    \PDO::ATTR_EMULATE_PREPARES   => false,
];
$dsn = "mysql:host=$host;dbname=$db;charset=$charset";
try {
     $pdo = new \PDO($dsn, $user, $pass, $options);
} catch (\PDOException $e) {
  throw new \PDOException($e->getMessage(), (int)$e->getCode());
} 
        // make query
        $query = "SELECT * FROM customer";
        $stmt = $pdo->query( $query ) or die ( "error en la consulta");

        //show data
        // header table
        echo "<table borde='2'>";
        echo "<tr>";
        echo "<th>Nombre</th>";
        echo "<th>Dirección</th>";
        echo "</tr>";

        // Bucle while for each registry
        while ($columna = $stmt->fetch())
        {
                echo "<tr>";
                echo "<td>" . $columna['name'] . "</td><td>" . $columna['address'] . "</td>";
                echo "</tr>";
        }

        echo "</table>"; // end table
        // close database
 //     mysqli_close( $conexion );
?>

