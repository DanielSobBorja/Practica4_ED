## ENTORNOS DE DESARROLLO - 1 DAW
## Daniel Sobrino Ollé
# PRÁCTICA 4

### Primeros pasos
Para esta práctica empezaré por crear el repositorio mediante la interfaz gráfica que nos ofrece github. Para poder acceder y modificar el repositorio he tenido que crear un token, para posteriormente autentificarme con este.
<img src="CapturasED/1-create-repo.PNG">

Primero creo un archivo ```.gitignore``` para evitar que controle el estado de archivos o directorios indeseados. Una vez creado este, ejecuto ```git init``` para inicializar el repositorio en local, y añado los directorios a la "vigilancia".
<img src="CapturasED/2-gitignore-init-add">

Una vez añadidos, puedo hacer un commit de todos estos archivos y directorios.
<img src="CapturasED/3-commit.PNG">

### Subiendo a Github
Decido crear ahora el ```README.md``` mediante la terminal y le hago commit. A continuación enlazo mi directorio local con el repositorio de github y subo los commits.
<img src="CapturasED/4-readme-commit-push.PNG">
<img src="CapturasED/5-muestra-push.PNG">

Ahora creo la rama pruebas, donde realizaré algunas refactorizaciones de mi código.
<img src="CapturasED/6-branch-push">
<img src="CapturasED/6-muestra-branch">

Mediante el ```git log``` puedo ver los registros de los distintos commits. Para tener un mejor control de versiones, le añado el versionado semántico haciendo uso de las tags. Subo las tags al repositorio con el comando ```git push --tags```.
<img src="CapturasED/7-tag-1.PNG">
<img src="CapturasED/8-tag-2-push-tags.PNG">
<img src="CapturasED/9-muestra-tags.PNG">

#### Refactorizaciones
Es momento de comenzar a hacer refactorizaciones del código, usando la rama pruebas que hemos creado anteriormente, para así hacer ```merge``` con la rama main una vez estoy contento con los cambios.
Los cambios que realizaré son:
- Renombrar clase Persona a clase Humano
- Arreglar errores por uso de la letra ñ en ```Niño.class```.

Después de cada refactorización usaré ```git status``` para ver las modificaciones, y ```git commit -am ""``` para añadir y registrar estos cambios.
<img src="CapturasED/10-2-refactoring.PNG">

Como todo parece haber ido bien, me muevo a la rama main para posteriormente fusionarle la rama de pruebas donde he realizado las refactorizaciones.
<img src="CapturasED/11-merge.PNG">

A cada commit le asignaré una tag mediante la misma metodología vista anteriormente. Este es el resultado final:
<img src="CapturasED/12-more-tags.PNG">

En un momento dado he vuelto a llamar v1.0.0 a una tag por error, y al eliminarla se han eliminado ambas, la primera tag, y la nueva. Por desconocimiento he vuelto a añadirla, lo que ha causado el error que se ve a continuación al hacer el push, pero no ha dado más problemas.
<img src="CapturasED/13-push-tags-error-sobreescribir.PNG">

Para la última refactorización creo otra rama, llamada "otra", me desplazo a esta y la subo.
<img src="CapturasED/14-branch-otra.PNG">
La refactorización consiste en:
1. Elimiar la interfaz sonido.
2. Borrar las distintas implementaciones de esta.
3. Comentar los métodos que hacían uso de la interfaz.
4. Comentar las distintas llamadas a esos métodos.

Después de hacer commit de la refactorización, me muevo a la main y hago merge con la rama donde he realizado los cambios.
<img src="CapturasED/15-merge-otra.PNG">

Añado las tags que falten y subo los cambios a github.
<img src="CapturasED/16-tag-otra.PNG">
<img src="CapturasED/17-muestra-repositorio.PNG">

Aquí se puede ver una comparación de los distintos commits con sus respectivos tags, en terminal e interfaz de github.
<img src="CapturasED/18-muestra-commits-tags.PNG">
