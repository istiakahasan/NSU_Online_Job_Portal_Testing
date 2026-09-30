# 🧪 NSU Online Jobs Portal — QA Automation & Manual Testing

An end-to-end **Quality Assurance and Test Automation project** for the **North South University (NSU) Online Jobs Portal**, combining automated UI testing with comprehensive manual test documentation.

The project uses **Java, Selenium WebDriver, and JUnit 5** to automate critical user workflows and validate functional, negative, boundary, and navigation scenarios.

---

## 📌 Project Overview

The objective of this project is to test the major functionalities of the NSU Online Jobs Portal from a candidate's perspective.

The project covers:

* 🔐 Authentication and session validation
* 👤 Candidate profile creation
* 📝 Personal information management
* 🎓 Educational information
* 💼 Employment history
* 👥 Reference management
* 📎 File upload functionality
* 🧭 Portal navigation
* 🔎 Job category filtering
* ❌ Negative test scenarios
* 📏 Boundary value testing
* 🔄 Regression testing

The repository contains both **automated Selenium test scripts** and **manual QA test documentation**.

---

## 🎯 Testing Scope

### 1. 🔐 Authentication

Test scenarios include:

* Login functionality
* Valid and invalid credentials
* Session handling
* Logout functionality
* Logout redirection
* Authentication-related navigation

### 2. 👤 Personal Information

The personal information module is tested for:

* Required field validation
* Name fields
* Address information
* Gender selection
* Religion selection
* Nationality selection
* Country selection
* Marital status
* NID upload
* Signature upload
* Resume/CV upload
* Form validation

### 3. 🎓 Educational Information

The education section covers:

* University selection
* Degree selection
* Major/department selection
* Academic information
* Marks/CGPA fields
* Degree completion information
* Dynamic dropdowns
* Select2 searchable dropdowns
* Certificate/transcript uploads
* Mandatory-field validation

### 4. 💼 Employment History

Testing includes:

* Adding employment records
* Employer information
* Job position/role
* Employment dates
* Current employment status
* Job responsibilities
* Dynamic employment fields
* Validation of employment information

### 5. 👥 References

The reference module is tested for:

* Adding references
* Removing references
* Dynamic DOM elements
* Reference information validation
* Multiple reference entries

### 6. 🧭 Portal Navigation

Navigation testing includes:

* Home navigation
* User Guide navigation
* Job category navigation
* Administrative jobs
* Academic careers
* Navigation links and redirects

---

# 🧪 Testing Methodology

The project applies multiple QA testing techniques.

| Testing Type            | Purpose                                             |
| ----------------------- | --------------------------------------------------- |
| Functional Testing      | Verify that features work according to requirements |
| UI Testing              | Validate user interface elements and interactions   |
| Negative Testing        | Verify behavior with invalid or unexpected inputs   |
| Boundary Testing        | Validate minimum/maximum input limits               |
| Regression Testing      | Ensure existing functionality remains stable        |
| Validation Testing      | Verify required fields and input constraints        |
| Navigation Testing      | Verify links, redirects, and portal navigation      |
| File Upload Testing     | Validate supported document/image uploads           |
| Dynamic Element Testing | Validate dynamically generated form elements        |

---

# 🛠️ Technology Stack

### Programming Language

* **Java**

### Automation Framework

* **Selenium WebDriver 4.x**

### Test Framework

* **JUnit 5**

### Build Tool

* **Gradle**

### Browser

* **Google Chrome**
* **ChromeDriver**

### Development Environment

* IntelliJ IDEA
* Eclipse
* VS Code

---

# 📋 Prerequisites

Before running the automation tests, make sure the following are installed:

1. **JDK 11 or higher**
2. **Google Chrome**
3. **Gradle** (or use the included Gradle Wrapper)
4. An IDE such as:

   * IntelliJ IDEA
   * Eclipse
   * VS Code

---

# 📁 Project Structure

```text
NSU_Online_Job_Portal_Testing/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               └── Main.java
│   │
│   └── test/
│       └── java/
│           ├── MyJunitAutomation.java
│           └── Utils.java
│
├── NSU_Online_Jobs_Portal_Comprehensive_QA_Test_Cases.xlsx
├── NSU_Online_Jobs_Portal_QA_Test_Cases.xlsx
├── NSU_Online_Jobs_Portal_QA_Test_Documentation.docx
│
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
├── .gitignore
└── README.md
```

---

# 🚀 How to Run the Automation Tests

## 1. Clone the Repository

```bash
git clone https://github.com/istiakahasan/NSU_Online_Job_Portal_Testing.git
```

Navigate into the project:

```bash
cd NSU_Online_Job_Portal_Testing
```

---

## 2. Run the Tests Using Gradle

### Windows

```bash
gradlew.bat test
```

### Linux / macOS

```bash
./gradlew test
```

---

## 3. Run Tests from IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Allow Gradle to synchronize the project.
3. Navigate to:

```text
src/test/java/MyJunitAutomation.java
```

4. Right-click the test class.
5. Select:

```text
Run 'MyJunitAutomation'
```

---

# 🔍 Automation Highlights

The Selenium automation suite demonstrates practical automation concepts including:

* WebDriver initialization
* Browser automation
* JUnit 5 lifecycle methods
* Element identification
* Form interaction
* Dropdown handling
* Select2 component interaction
* JavaScript execution
* Scrolling
* Action chains
* File uploads
* Dynamic web elements
* Assertions
* Test organization
* Utility/helper methods

---

# 📊 Manual QA Documentation

The repository also includes detailed manual testing resources.

### 📑 QA Test Cases

The Excel test cases cover:

* Test case IDs
* Test scenarios
* Preconditions
* Test steps
* Expected results
* Actual results
* Test status
* Negative scenarios
* Boundary scenarios

### 📘 QA Documentation

The project also contains a dedicated QA documentation file describing the testing approach and coverage.

---

# 🧩 Key Selenium Concepts Demonstrated

This project provides practical experience with:

```text
WebDriver
WebElement
By Locators
XPath
CSS Selectors
JUnit 5
@BeforeEach
@AfterEach
Assertions
Select
Actions
JavaScriptExecutor
File Upload
Dynamic Elements
Select2
Implicit Wait
Browser Navigation
```

---

# 🧪 Example Automation Flow

A typical automated workflow follows this pattern:

```text
Open Browser
     ↓
Navigate to NSU Jobs Portal
     ↓
Login
     ↓
Create / Update Candidate Profile
     ↓
Enter Personal Information
     ↓
Enter Educational Information
     ↓
Enter Employment Information
     ↓
Add References
     ↓
Upload Required Documents
     ↓
Validate Form
     ↓
Submit
     ↓
Verify Result
     ↓
Logout
```

---

# 📈 QA Skills Demonstrated

This project demonstrates practical knowledge of:

* Manual Software Testing
* Test Case Design
* Test Scenario Design
* UI Automation
* Selenium WebDriver
* Java
* JUnit 5
* Functional Testing
* Regression Testing
* Negative Testing
* Boundary Value Analysis
* Form Validation
* Dynamic Web Element Handling
* File Upload Testing
* Browser Automation
* Test Documentation

---

# ⚠️ Disclaimer

This project is intended for **educational and testing purposes**.

The automation scripts are designed to demonstrate QA and Selenium automation techniques against the publicly accessible NSU Online Jobs Portal.

Please ensure that automated testing is performed responsibly and does not disrupt the availability or normal operation of the target system.

---

# 👨‍💻 Author

**Istiak Ahasan**

Computer Science & Engineering

GitHub:
https://github.com/istiakahasan

---

# ⭐ Project

If you find this project useful for learning **Selenium, Java, JUnit, or QA Automation**, consider giving the repository a star.

**Repository:**
https://github.com/istiakahasan/NSU_Online_Job_Portal_Testing
