# web: java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war
# web: java -cp target/classes/:target/dependency/* Personal_Form.projeto_cadastro_pessoas.ProjetoCadastroPessoasApplication
# web: java $JAVA_OPTS -cp target/classes:target/dependency/* Personal_Form.projeto_cadastro_pessoas.ProjetoCadastroPessoasApplication
web:  java $JAVA_OPTS -Dserver.port=$PORT -Dspring.profiles.active=prod -jar target/*.jar
