# Java Upgrade Plan: java-fx -> Java 21 LTS

**Session ID**: 20260307135300  
**Project Name**: javafx  
**Current Branch**: N/A (Git not available)  
**Current Commit ID**: N/A (Git not available)  
**Plan Generated**: 2026-03-07 13:53:00  
**Git Status**: Changes are not version-controlled (user chose to proceed without Git)

---

## User-Specified Targets

- **Java**: 11 → **21 LTS**
- **Spring Boot** (if applicable): N/A
- **Other frameworks**: JavaFX

## Guidelines

_(None specified by user)_

## Available Tools

| Tool              | Version | Path                                          | Status  |
|-------------------|---------|-----------------------------------------------|---------|
| JDK               | 21.0.8  | C:\Program Files\Java\jdk-21\bin              | Ready   |
| Maven             | 3.9.9   | C:\Program Files\apache-maven-3.9.9\bin       | Ready   |
| Maven Wrapper     | N/A     | Not present in project                        | N/A     |

## Technology Stack

| Component                      | Current | Target (Java 21) | Status    | Notes                                    |
|--------------------------------|---------|------------------|-----------|------------------------------------------|
| **Java**                       | 11      | 21               | Upgrading | LTS version                              |
| **JavaFX** (javafx-controls)   | 13      | 21               | EOL/Upgrade | Version 13 is EOL, requires Java 11+ update for Java 21 |
| **JavaFX** (javafx-fxml)       | 13      | 21               | EOL/Upgrade | Version 13 is EOL, requires update       |
| **Maven Compiler Plugin**      | 3.8.0   | 3.12.1           | Upgrade   | Older version, should update for better Java 21 support |
| **JavaFX Maven Plugin**        | 0.0.6   | 0.0.8            | Upgrade   | Old version, may have compatibility issues |

## Derived Upgrades

| Dependency | Current | Recommended | Reason | Risk |
|-----------|---------|-------------|--------|------|
| javafx-controls | 13 | 21.0.3 | Required for Java 21 support | Low (official JavaFX for Java 21) |
| javafx-fxml | 13 | 21.0.3 | Required for Java 21 support | Low (official JavaFX for Java 21) |
| maven-compiler-plugin | 3.8.0 | 3.12.1 | Better Java 21 compilation support | Low (patch-level compatible) |
| javafx-maven-plugin | 0.0.6 | 0.0.8 | Better compatibility with newer JavaFX | Low (patch compatible) |

## Key Challenges

1. **JavaFX version compatibility**: JavaFX 13 is far from Java 21 in terms of API stability. The jump requires updating to JavaFX 21.x.
2. **Module system**: JavaFX requires proper module configuration for Java 11+. Ensure module-info files are not causing issues.
3. **Plugin compatibility**: Older maven-compiler-plugin and javafx-maven-plugin versions may have Java 21 compatibility issues.
4. **Build tool chain**: Maven 3.9.x has stricter enforcement of security and plugin management.

## Upgrade Steps

### Step 1: Setup Environment ⏳

**Purpose**: Ensure all required JDKs and build tools are available.

**Actions**:
- ✅ JDK 21.0.8 is already installed and available
- ✅ Maven 3.9.9 is already installed and available
- No installation needed

**Verification**:
```bash
java -version
mvn -version
```

---

### Step 2: Setup Baseline ⏳

**Purpose**: Establish baseline for current build/tests with Java 11.

**Actions**:
- Record current state (Java 11, JavaFX 13)
- Run `mvn clean compile` to verify compilation baseline
- Run `mvn clean test` to capture baseline test results
- Document any pre-existing test failures

**Verification**:
```bash
mvn clean test-compile
mvn clean test
```

---

### Step 3: Upgrade Java Compiler Release to 21 ⏳

**Purpose**: Update the maven-compiler-plugin and Java release target to 21.

**Actions**:
1. Update `pom.xml`:
   - Change `maven.compiler.release` from `11` to `21`
   - Update `maven-compiler-plugin` version from `3.8.0` to `3.12.1`
   - Update plugin `<release>` configuration from `11` to `21`

**Verification**:
```bash
mvn clean test-compile
```
Expected: Compilation succeeds (test failures acceptable at this stage)

---

### Step 4: Upgrade JavaFX Dependencies ⏳

**Purpose**: Update JavaFX libraries to Java 21 compatible versions.

**Actions**:
1. Update `pom.xml`:
   - Change `javafx-controls` version from `13` to `21.0.3`
   - Change `javafx-fxml` version from `13` to `21.0.3`
   - Update `javafx-maven-plugin` version from `0.0.6` to `0.0.8`

**Verification**:
```bash
mvn clean test-compile
```
Expected: Compilation succeeds

---

### Step 5: Final Validation ⏳

**Purpose**: Verify all dependencies are compatible, code compiles, and tests pass.

**Actions**:
1. Run full compilation and test suite
2. Verify no module-related errors
3. Document any test failures and root causes
4. Fix any breaking changes from JavaFX 13→21 upgrade

**Verification**:
```bash
mvn clean test
```
Expected: All tests pass (100% pass rate)

---

## Options

| Option | Value | Notes |
|--------|-------|-------|
| Run tests before and after the upgrade | true | Full test coverage required |
| Git available | false | User chose to continue without Git |
| Dry-run only | false | Execute full upgrade |

---

## Plan Review

**Status**: Ready for execution

**Completeness**: All sections populated, no blockers identified.

**Known Limitations**: 
- No Git for version control; changes remain uncommitted in working directory
- JavaFX is a UI framework that may have deprecated APIs moving from 13 to 21; application code may need updates

---

