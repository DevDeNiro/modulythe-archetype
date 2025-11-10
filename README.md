# Modulythe Archetype

### 🚧🚧🚧 WIP 🚧🚧🚧

This is a Maven archetype for creating multi-module Spring Boot projects based on a hexagonal architecture.

The generated project is inspired by the structure of the `modulythe-core` project and provides a solid foundation for
building modular and maintainable applications.

## Prerequisites

* Java 21 or higher
* Maven 3.8 or higher

## How to Use

### 1. Install the Archetype Locally

First, you need to build and install the archetype in your local Maven repository (`~/.m2/repository`).

Navigate to the root of this `modulythe-archetype` directory and run the following command:

```bash
mvn clean install
```

This will make the archetype available for generating new projects.

### 2. Generate a New Project

Once the archetype is installed, you can generate a new project from it. Navigate to the directory where you want to
create your new project and run the following command:

```bash
mvn archetype:generate \
    -DarchetypeGroupId=com.modulythe.framework \
    -DarchetypeArtifactId=modulythe-archetype \
    -DarchetypeVersion=1.0.0-SNAPSHOT
```

Maven will then enter interactive mode and prompt you to enter the `groupId`, `rootArtifactId`, `artifactId`, `version`,
and `package` for
your new project.

* groupId (com.bank): Identifies the project's organization.
* rootArtifactId (account): The base name for the entire multi-module project. ➜ Comes from "Error merging velocity
  templates"
* artifactId (project): This is the artifactId of the current module within the archetype's templates.
* package (com.bank.project): The base Java package, usually derived from groupId and rootArtifactId.

**Example:**

When prompted, you can enter the following values:

* `Define value for property 'groupId'`: `com.mycompany`
* `Define value for property 'artifactId'`: `myproject`
* `Define value for property 'version'`: `1.0.0-SNAPSHOT`
* `Define value for property 'package'`: `com.mycompany.myproject`

This will create a new project in a directory named `myproject`.

#### Non-Interactive Mode

Alternatively, you can provide all the properties directly in a single command to skip the interactive prompts:

```bash
mvn archetype:generate \
    -DarchetypeGroupId=com.modulythe.framework \
    -DarchetypeArtifactId=modulythe-archetype \
    -DarchetypeVersion=1.0.0-SNAPSHOT \
    -DgroupId=com.mycompany \
    -DartifactId=myproject \
    -Dversion=1.0.0-SNAPSHOT \
    -DinteractiveMode=false
```

### Generated Project Structure

The generated project will have the following multi-module structure, ready for development:

* `myproject` (parent pom)
    * `myproject-domain`: Contains the domain models and ports (interfaces). This module is framework-agnostic.
    * `myproject-application`: Contains the application logic, use cases, and orchestrates the domain layer.
    * `myproject-infrastructure`: Contains the infrastructure implementations, such as database repositories, external
      service clients, etc.
    * `myproject-presentation`: Contains the presentation layer (e.g., REST controllers) and is the main runnable Spring
      Boot application.

More informations regarding the folder structure created on :