.PHONY: build
build:
	./gradlew build

.PHONY: run
run:
	./gradlew :api:bootRun

.PHONY: test
test:
	./gradlew test

.PHONY: init_db
init-db:
	docker-compose up
