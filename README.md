# Parabank Automation Testing Framework

Ovaj projekt predstavlja okvir (framework) za automatizirano testiranje programske podrške, izrađen u Javi. Okvir je razvijen za testiranje web aplikacije [Parabank](https://parabank.parasoft.com/parabank/index.htm) koristeći Selenium WebDriver i TestNG. 

## Koristeni alati i tehnologije

- **Jezik:** Java
- **Test Framework:** TestNG
- **Automatizacijski alat:** Selenium WebDriver
- **Build alat:** Maven
- **Driver Management:** WebDriverManager
- **Dizajn Pattern:** Page Object Model (POM)
- **Napredne tehnike:** Explicit Wait naredbe, OOP principi
- **Reporting:** Generiranje HTML izvješća pomoću Maven Surefire Report plugina (u terminal upisati naredbu *mvn surefire-report:report* nakon čijeg pokretanja će se izvješće nalaziti u `target/site/surefire-report.html`)
- **.gitignore**

## Instalacija i Pokretanje

### Preduvjeti

- Java Development Kit (JDK) 8 ili noviji
- Maven
- Git

### Kloniranje i pokretanje
 Framework je moguće preuzeti tako što se klonira unosom naredbe u Command Prompt/Terminal: *git clone `https://github.com/tplesko/MiTTPP_projektni_zadatak.git`*.
 Nakon kloniranja, potrebno je ući u projekt i buildati ga naredbom `mvn clean install` (naredba će preuzeti sve potrebne ovisnosti, kompajlirati kod i sl.)
 Na kraju, testovi se mogu pokrenuti naredbom `mvn clean test` ili iz **IntelliJ-a**:
  1. Otvorite projekt u IntelliJ IDEA.
  2. U "Project" prozoru, pronađite mapu src/test/java/tests.
  3. Desnim klikom odaberite "Run All Tests" ili pokrenite pojedinačne test klase.
 




