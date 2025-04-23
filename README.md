# 🛡️ AgeOfWar - Java Console Strategy Game

**AgeOfWar** is a Java 17 console application built with Gradle. It simulates medieval battle strategies between platoons, determining a winning arrangement based on unit strengths and matchups.

---

##  Tech Stack

- Java 17
- Gradle
- JUnit 5 for testing
- Console-based UI

---

##  Getting Started

### 1 Clone the Repository

```bash
git clone https://github.com/laki2603/AgeOfWar.git
cd AgeOfWar
```

---

### 2️ Import Into Eclipse

If you're using **Eclipse IDE**:

1. Open Eclipse
2. Go to `File > Import > Gradle > Existing Gradle Project`
3. Select the root folder (`AgeOfWar`)
4. Finish the wizard to import it as a Gradle project

If "Existing Gradle Project" is not available, ensure you have the **Buildship Gradle Integration** plugin installed from the Eclipse Marketplace.

---

### 3️ Build and Run

#### Run via Terminal:

```bash
./gradlew build      # Builds the project
./gradlew run        # Runs the Main class
```

#### Run in Eclipse:

1. Locate `Main.java` under `src/main/java`
2. Right-click → `Run As` → `Java Application`

---

###  Run Unit Tests

#### From Terminal:

```bash
./gradlew test
```

#### From Eclipse:

1. Open `BattlePlannerTest.java` in `src/test/java`
2. Right-click → `Run As` → `JUnit Test`

---

##  Example Input


Enter your platoons:
```
Spearmen#10;Militia#30;FootArcher#20;LightCavalry#1000;HeavyCavalry#120
```
Enter enemy platoons:
```
Militia#10;Spearmen#10;FootArcher#1000;LightCavalry#120;CavalryArcher#100
```

---

## 🛠 Prerequisites

- Java 17 or higher
- Gradle 7 or higher
- Git (for cloning the repo)

---

##  Author

**Lakshmi Narayanan S**  
GitHub: [@laki2603](https://github.com/laki2603)

---
