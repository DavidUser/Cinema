all: classes configuration

SRC_PATH=src
BUILD_PATH=bin
CONFIG_PATH=$(SRC_PATH)/META-INF

LIBRARIES=/home/david/Downloads/postgresql-9.3-1102.jdbc4.jar:/home/david/Downloads/JPA/hibernate-jpa-2.1-api-1.0.0.Final.jar:/home/david/Downloads/JPA/hibernate-entitymanager-4.3.6.Final.jar:/home/david/Downloads/JPA/hibernate-commons-annotations-4.0.5.Final.jar:/home/david/Downloads/JPA/hibernate-core-4.3.6.Final.jar:/home/david/Downloads/JPA/jboss-logging-3.1.3.GA.jar:/home/david/Downloads/JPA/jboss-logging-annotations-1.2.0.Beta1.jar:/home/david/Downloads/JPA/jboss-transaction-api_1.2_spec-1.0.0.Final.jar:/home/david/Downloads/JPA/antlr-2.7.7.jar:/home/david/Downloads/JPA/dom4j-1.6.1.jar:/home/david/Downloads/JPA/jandex-1.1.0.Final.jar:/home/david/Downloads/JPA/javassist-3.18.1-GA.jar

run:
	java -cp $(BUILD_PATH):$(LIBRARIES) Main

configuration:
	cp -r $(CONFIG_PATH) $(BUILD_PATH)

classes:
	javac -cp $(SRC_PATH):$(LIBRARIES) $(SRC_PATH)/entity/*.java -d $(BUILD_PATH)
	javac -cp $(SRC_PATH):$(LIBRARIES) $(SRC_PATH)/*.java -d $(BUILD_PATH)

clean:
	rm -rf $(BUILD_PATH)/*
