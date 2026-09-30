# 🧪 NSU Online Jobs Portal – Automated & Manual QA Test 

[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Java](https://img.shields.io/badge/Java-11%2B-ED8B00?logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

An end-to-end Quality Assurance (QA) testing repository for the **North South University (NSU) Online Jobs Portal** ([jobs.northsouth.edu](https://jobs.northsouth.edu/)). 

This project contains automated UI test scripts built using **Java**, **Selenium WebDriver**, and **JUnit 5**, alongside manual QA test documentation covering functional, regression, boundary, and negative test scenarios.

---

## 📌 Project Features & Scope

The test suite validates critical user workflows across candidate onboarding, profile creation, application submissions, and portal navigation:

* **Authentication:** User login validation, session tracking, and logout redirects.
* **Personal Information:** Mandatory form inputs, address details, interactive dropdowns (Gender, Religion, Nationality), and file uploads (NID, Signature, Resume).
* **Educational Profile:** Dynamic **Select2** searchable dropdown lookups, degree/major entries, academic marks, and certificate/transcript attachment uploads.
* **Employment History:** Experience tracking, current role toggles, and dynamic employment responsibilities.
* **References:** Dynamic DOM element additions and deletions for candidate references.
* **Portal Navigation:** Navigation bar verification (User Guide, Home) and Job category filtering (*All Jobs*, *Administrative*, *Academic Careers*).

---

## 🛠️ Tech Stack & Prerequisites

### Tech Stack
* **Language:** Java 11+
* **Test Framework:** JUnit 5 (`org.junit.jupiter`)
* **Automation Library:** Selenium WebDriver (v4.x)
* **Browser Driver:** ChromeDriver
* **Build System:** Gradle / Maven

### Prerequisites
1. **JDK 11 or higher** installed and configured in system path.
2. **Google Chrome** browser installed.
3. An IDE such as **IntelliJ IDEA**, **Eclipse**, or **VS Code**.

---

## 📁 Repository Structure

```text
NSU_Online_Job_Portal_Testing/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/
│   │           └── Main.java
│   └── test/
│       └── java/
│           ├── MyJunitAutomation.java   # Main Selenium & JUnit 5 Test Automation Suite
│           └── Utils.java                # Helper functions (JS Scroll, Action helpers)
├── docs/
│   └── NSU_Online_Jobs_Portal_Comprehensive_QA_Test_Cases.xlsx  # Full QA Matrix
├── build.gradle                          # Gradle Build Configuration
├── .gitignore                            # Git Ignore Rules
└── README.md                             # Repository Documentation
