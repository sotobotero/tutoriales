# Spring boot CRUD By [Sotobotero](https://sotobotero.com)

**Content**   
1. [Como contribuir con este proyecto](#como-contribuir-con-este-proyecto)
2. [How contribute to this project](#how-contribute-to-this-project)

## Como contribuir con este proyecto.

1. Primero, necesitas hacer un fork del repositorio al que deseas contribuir de manera manual en GitHub.
**Selecciona la rama que quieres forkear (por ejemplo, "develop" si es necesario) y  haz clic en el botón "Fork" en la esquina superior derecha de la página del repositorio.
Esto creará una copia del repositorio en tu cuenta de GitHub
Tambien Puedes hacer el fork de todas las ramas o de la rama develop 

2. A continuación, necesitas clonar tu repositorio bifurcado en tu máquina local. Esto te permitirá trabajar en los archivos del proyecto sin conexión. Puedes clonar tu repositorio bifurcado utilizando el comando git clone con la URL de tu bifurcación.
```bash
git clone https://github.com/tu-usuario/tu-fork-del-repositorio.git
cd tu-fork-del-repositorio
```
3. Después de clonar tu repositorio bifurcado, necesitas crear una rama para trabajar en tus cambios. Una rama es una versión separada del código que puedes modificar sin afectar la rama principal. Puedes crear una rama utilizando el comando git branch con el nombre de tu rama.
```bash
git branch nombre-de-tu-rama
```
4. Una vez que hayas creado una rama, necesitas cambiar a ella utilizando el comando git checkout con el nombre de tu rama. Esto hará que tu rama sea la activa y cualquier cambio que hagas se aplicará a ella. 
```bash
git checkout nombre-de-tu-rama
```
5. Ahora puedes empezar a trabajar en tus cambios. Puedes editar, agregar o eliminar cualquier archivo en tu rama como desees. Puedes utilizar cualquier editor de código o IDE que prefieras. 

6. Después de hacer tus cambios, necesitas hacer commit de ellos en tu rama. 
```bash
git add .
git commit -m "titulo d elos cambios", -m "Descripción de los cambios realizados"
```
7. A continuación, necesitas enviar tus cambios a tu repositorio bifurcado en GitHub. Esto subirá tu rama y sus commits a tu repositorio en línea. Puedes enviar tus cambios utilizando el comando git push con el nombre de tu remoto (normalmente origin) y el nombre de tu rama.
```bash
git push origin nombre-de-tu-rama
```
8. Por último, necesitas crear una solicitud de extracción (pull request) desde tu rama al repositorio original del que hiciste la bifurcación. Una solicitud de extracción es una solicitud para que los mantenedores del repositorio original revisen y fusionen tus cambios en su rama principal. 
```text
# Crear una Pull Request (PR) en GitHub (manual).
# - Ve a tu repositorio bifurcado en GitHub.
# - Haz clic en "Pull Request" y selecciona la rama en la que has trabajado.
# - Crea la PR hacia la rama principal o la rama correspondiente del repositorio original.
```

## How contribute to this project. 
1. First, you need to manually fork the repository you want to contribute to on GitHub. **Select the branch you want to fork (for example, "develop" if necessary) and click the "Fork" button in the upper right corner of the repository page. This will create a copy of the repository in your GitHub account. You can also fork all branches or just the develop branch.

2. Next, you need to clone your forked repository to your local machine. This will allow you to work on the project files offline. You can clone your forked repository using the git clone command with the URL of your fork.
```bash
git clone https://github.com/your-username/your-forked-repository.git
cd your-forked-repository
```
3. After cloning your forked repository, you need to create a branch to work on your changes. A branch is a separate version of the code that you can modify without affecting the main branch. You can create a branch using the git branch command with the name of your branch.
```bash
git branch your-branch-name
```
4. Once you have created a branch, you need to switch to it using the git checkout command with the name of your branch. This will make your branch active and any changes you make will apply to it.
```bash
git checkout your-branch-name
```
5. Now you can start working on your changes. You can edit, add, or delete any files in your branch as you wish. You can use any code editor or IDE you prefer.

6. After making your changes, you need to commit them to your branch.
```bash
git add .
git commit -m "title of the changes" -m "Description of the changes made"
```
7. Next, you need to push your changes to your forked repository on GitHub. This will upload your branch and its commits to your online repository. You can push your changes using the git push command with the name of your remote (usually origin) and the name of your branch.
```bash
git push origin your-branch-name
```
8. Finally, you need to create a pull request from your branch to the original repository you forked from. A pull request is a request for the maintainers of the original repository to review and merge your changes into their main branch.
```text
# Create a Pull Request (PR) on GitHub (manual).
# - Go to your forked repository on GitHub.
# - Click on "Pull Request" and select the branch you worked on.
# - Create the PR towards the main branch or the corresponding branch of the original repository.
```