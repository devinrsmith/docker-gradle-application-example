### Docker Gradle Application Example

Build: `./gradlew build`

Run app1 natively: `./gradlew app1:run` 

Run app2 natively: `./gradlew app2:run` 

Build docker images: `./gradlew dockerBuildImage`

Run app1 in docker: `docker run gcr.io/example-gcp-project/com.devinrsmith.example/app1:0.0.1-SNAPSHOT`

Run app2 in docker: `docker run gcr.io/example-gcp-project/com.devinrsmith.example/app2:0.0.1-SNAPSHOT`

Note: built as an example of how I would like to use Jib: https://github.com/GoogleContainerTools/jib/issues/1211
