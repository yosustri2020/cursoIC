#MAVEN

##Creacion de un nuevo proyecto JAVA basado en una plantilla (arquetipo)
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
#Identificar un proyecto MAVEN:
-groupID: Empresa/Oraganizacion al cargo del desarrollo(Dominio internet inverido)
        -Ejemplo: com. gfi
    -que estoy desarrolladnfo a lato nivel?
        -Ejemplo web-app-nominas
-artifactId: que es nuestro proyecto a bajo nivel?

El identificador de un proyecto es groupID + artifactId

#GOLES
mvn GOLES_NAME
        -clean:             
        -compile:           compilacion del proyecto
        -test compile:      Compilar los test unitarios
        -test:              Ejecutar todas las pruebas unitarias
        -package            Emapaquetar proyecto
        - install:          Incluir nuestro artefacto 
        