import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyJunitAutomation {
    WebDriver driver;
    Actions actions;
    @BeforeEach
    public void setUp(){
         driver=new ChromeDriver();
       actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//we will wait maximum 30 second

    }

    //Login
    public void login() {
        driver.get("https://jobs.northsouth.edu/");
        driver.get("https://jobs.northsouth.edu/login");//Login Page enter
        driver.findElement(By.id("email")).sendKeys("istiak.ahasan@northsouth.edu");
        driver.findElement(By.id("password")).sendKeys("****");
        driver.findElement(By.className("btn")).click();
    }
//PersonalInformation

    @Test
    public void personalInformation (){

        //First login
        login();

        driver.get("https://jobs.northsouth.edu/create-profile");//Profile page create
        driver.findElement(By.id("full_name")).sendKeys("istiak ahasan");
        driver.findElement(By.id("email")).sendKeys("istiak.ahasan@northsouth.edu");
        driver.findElement(By.id("father_name")).sendKeys("rahim rahman");
        driver.findElement(By.id("mother_name")).sendKeys("jahanara begum");

        Utils.scroll(driver, 0, 50);
//for marital status
        WebElement maritalStatus = driver.findElement(By.id("marrital_status"));

// Move mouse → click dropdown → type/select Married → Enter
        actions.moveToElement(maritalStatus).click().sendKeys("Unmarried")//Unmarried//Separated//Widowed//Divorced
                .sendKeys(Keys.ENTER)
                .perform();


//for gender
         WebElement gender=driver.findElement(By.id("gender"));
        actions.moveToElement(gender).click().sendKeys("Male")//Female
                .sendKeys(Keys.ENTER)
                .perform();

        //For religion
        WebElement religion=driver.findElement(By.id("select2-religion-container"));
        actions.moveToElement(religion).click().sendKeys("Islam")//Hinduism//Buddism//Christianity
                .sendKeys(Keys.ENTER)
                .perform();

        //For Date-Of-Birth
        WebElement dobStatus=driver.findElement(By.id("dob"));
        actions.moveToElement(dobStatus).click().sendKeys("2026-04-25")//Hinduism//Buddism//Christianity
                .sendKeys(Keys.ENTER)
                .perform();

        //**//for mobile
        driver.findElement(By.id("mobile")).sendKeys("01308885562");

        driver.findElement(By.id("emergency_contact")).sendKeys("013555894");

        driver.findElement(By.id("present_address")).sendKeys("Dhaks");

        driver.findElement(By.id("permanent_address")).sendKeys("dhaks");


        //**//fill check box
        WebElement checkbox = driver.findElement(
                By.cssSelector("input[type='checkbox'][value='1']")
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        Utils.scroll(driver, 0, 50);


        //**//For nationality
        WebElement nationality=driver.findElement(By.id("select2-nationality-container"));
        actions.moveToElement(nationality).click().sendKeys("Czech")
                .sendKeys(Keys.ENTER)
                .perform();


        //**//For blood-group
        WebElement bloodGroup=driver.findElement(By.id("blood_group"));
        actions.moveToElement(bloodGroup).click().sendKeys("A+")
                .sendKeys(Keys.ENTER)
                .perform();



        Utils.scroll(driver, 0, 50);

        //For residence
        WebElement residence = driver.findElement(By.cssSelector("[role='textbox']"));
        actions.moveToElement(residence).click().sendKeys("Albania").sendKeys(Keys.ENTER).perform();


        //**//nid
        driver.findElement(By.id("nid")).sendKeys("A8fd55520");


        //**//Language
        WebElement language = driver.findElement(By.cssSelector(".select2-selection.select2-selection--multiple"));
        actions.moveToElement(language).click().sendKeys("Bengali").sendKeys(Keys.ENTER).perform();
        Utils.scroll(driver, 0, 50);


//        //Nid Photo
//
//        WebElement uploadArea = driver.findElement(By.cssSelector("div.fileinput-preview.thumbnail[data-trigger='fileinput']"));
//        uploadArea.click();
//        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
//        fileInput.sendKeys("C:\\Users\\User\\Downloads\\nid.png");



        //**//NID Image
        WebElement nidPreview = driver.findElement(By.cssSelector("div[data-trigger='fileinput']"));
        nidPreview.click();
        WebElement nidImage = driver.findElement(By.id("nid_image"));
        nidImage.sendKeys("C:\\Users\\User\\Downloads\\signature.jpg");
        // 3. Click the button
        WebElement uploadButton1 = driver.findElement(By.id("signature"));
        uploadButton1.click();


        //**//signature
        WebElement signaturePreview = driver.findElement(By.cssSelector("div[data-trigger='fileinput']"));
        signaturePreview.click();
        WebElement signatureInput = driver.findElement(By.cssSelector("input[type='file']"));

        signatureInput.sendKeys("C:\\Users\\User\\Downloads\\CV\\istiak_signature.png");
        // 3. Click the button
        WebElement nid_button = driver.findElement(By.id("nid_photo"));
        nid_button.click();




        //cv
        WebElement cv = driver.findElement(By.id("cv"));
        cv.sendKeys("C:\\Users\\User\\Downloads\\CV\\istiak_ahasan.docx");
        String text = cv.getAttribute("value");
        assert text.contains("istiak_ahasan.docx");



        //save personal information
        WebElement personal = driver.findElement(By.className("btn btn-info btn-lg"));
        personal.click();

        //institution Name
        WebElement institution=driver.findElement(By.id("select2-institution_name0-hv-container"));
        actions.moveToElement(institution).click().sendKeys("A+")
                .sendKeys(Keys.ENTER)
                .perform();









        }


//Education Profile
    @Test
    void educationProfile() {

        //First login
        login();

        driver.get("https://jobs.northsouth.edu/create-profile");
        WebElement education = driver.findElement(By.cssSelector("a[href='#education']"));
        education.click();


        Utils.scroll(driver, 0, 50);

        //Education
        WebElement educationLevel = driver.findElement(By.id("level_of_edu_1"));
        educationLevel.click();

        Select select = new Select(educationLevel);
        select.selectByValue("Bachelor/Honors");

        // Degree Title - open Select2
        WebElement degree = driver.findElement(By.id("select2-degree_title_1-container"));
        degree.click();
        // Find the Select2 search box
        WebElement degreeSearch = driver.findElement(By.cssSelector("input.select2-search__field"));
        degreeSearch.sendKeys("Bachelor");

        // Check what options are currently available
        java.util.List<WebElement> options = driver.findElements(By.cssSelector("ul.select2-results__options li.select2-results__option"));
        System.out.println("Number of degree options: " + options.size());

        for (WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
        // Select the required option
        WebElement degreeName = driver.findElement(By.xpath("//li[contains(normalize-space(), 'Bachelor of Science in Computer Science')]"));
        degreeName.click();

        //Scroll
        Utils.scroll(driver, 0, 50);


        //Major
        WebElement major = driver.findElement(By.id("major_1"));
        major.click();
        major.sendKeys("Computer Science");

        //Institution Name
        WebElement institution=driver.findElement(By.id("select2-institution_name0-jh-container"));
        actions.moveToElement(institution).click().sendKeys("Versatile Model College")
                .sendKeys(Keys.ENTER)
                .perform();


        //Board Name
        WebElement board = driver.findElement(By.id("board_name_1"));
        actions.moveToElement(board).click().sendKeys("Barisal Board").sendKeys(Keys.ENTER).perform();

        //Result
        WebElement  result= driver.findElement(By.id("result_type1"));
        actions.moveToElement(board).click().sendKeys("Pass").sendKeys(Keys.ENTER).perform();

        //Marks
        driver.findElement(By.name("marks[0]")).sendKeys("85");

        //scroll
        Utils.scroll(driver, 0, 50);

        //Degree Ongoing
        WebElement ongoing = driver.findElement(By.id("degree_completion_1_1"));
        ongoing.click();

        //Passing Year
        driver.findElement(By.name("expected_year_of_passing[0]")).sendKeys("2027");

        Utils.scroll(driver, 0, 50);

        //Duration
        WebElement duration = driver.findElement(By.name("duration[0]"));
        duration.click();
        duration.sendKeys("4 years");

        //Country
        WebElement institutionName=driver.findElement(By.id("select2-country_edu_1-container"));
        actions.moveToElement(institutionName).click().sendKeys("Albania").sendKeys(Keys.ENTER).perform();

        //Achievements
        driver.findElement(By.name("achievement[0]"))
                .sendKeys("Developed and completed academic projects in software engineering and artificial intelligence.");

        //certificate
        String certificatePath = System.getProperty("user.dir") + "C:\\Users\\User\\Downloads\\Admit_Card_24909273.pdf";
        driver.findElement(By.id("certificate1")).sendKeys(certificatePath);

        //Transcript
        WebElement transcript = driver.findElement(By.id("transcript1"));
        transcript.sendKeys("C:\\Users\\User\\Downloads\\Admit_Card_24909273.pdf");

        //Scroll
        Utils.scroll(driver, 0, 50);



        //submit Button
        WebElement nid_button = driver.findElement(By.className("btn btn-info btn-lg"));
        nid_button.click();




    }


    //Employment History

    @Test
    void employmentHistory(){

        //First login
        login();

        driver.get("https://jobs.northsouth.edu/create-profile");
        // Employment History
        WebElement employment = driver.findElement(By.cssSelector("a[href='#employment']"));
        employment.click();

        //Scroll
        Utils.scroll(driver, 0, 50);

        //organization
        WebElement bloodGroup=driver.findElement(By.id("employment"));
        actions.moveToElement(bloodGroup).click().sendKeys("Teacher").sendKeys(Keys.ENTER).perform();

        //Designation
        WebElement Designation=driver.findElement(By.id("select2-designation_1-container"));
        actions.moveToElement(Designation).click().sendKeys("Deputy Project Coordinator").sendKeys(Keys.ENTER).perform();

        //Department
        WebElement Department=driver.findElement(By.id("employment"));
        actions.moveToElement(Department).click().sendKeys("Asian Mega Delta").sendKeys(Keys.ENTER).perform();

        // StartDate
        WebElement StartDate=driver.findElement(By.id("startdate_1"));
        actions.moveToElement(StartDate).click().sendKeys("2026-04-25")//date
                .sendKeys(Keys.ENTER)
                .perform();

        //EndingDate
        WebElement EndingDate=driver.findElement(By.id("enddate_1"));
        actions.moveToElement(EndingDate).click().sendKeys("2026-04-25")//date
                .sendKeys(Keys.ENTER)
                .perform();

        //Scroll
        Utils.scroll(driver, 0, 50);

        //**//fill check box
        WebElement checkbox = driver.findElement(By.cssSelector("#current_job_1"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }


        //Duration
        WebElement duration = driver.findElement(By.id("duration_emp_1"));

        String readonly = duration.getAttribute("readonly");

        //Responsibilities
        WebElement responsibilities = driver.findElement(By.id("responsibilites_1"));
        responsibilities.sendKeys("Developed backend APIs using Java and Spring Boot.");

        //Add more
        WebElement addMore = driver.findElement(By.cssSelector("button.btn-success"));
        addMore.click();

        //Submit button
        WebElement saveEmployment = driver.findElement(By.cssSelector("button[type='submit']"));
        saveEmployment.click();


    }



    @Test
    void References(){

        //First login
        login();

        //Reference Window
        WebElement referencesTab = driver.findElement(
                By.xpath("//a[@href='#references' and normalize-space()='References']"));
        referencesTab.click();

        //References
        WebElement reference = driver.findElement(By.id("reference_1"));
        reference.sendKeys("Mr. John Doe, Senior Software Engineer, ABC Company.");

        //Scroll
        Utils.scroll(driver, 0, 50);

        //Add more
        WebElement addReference = driver.findElement(By.cssSelector("button[onclick='addReference();']"));
        addReference.click();

        //remove button
        WebElement removeReference = driver.findElement(
                By.cssSelector("button[onclick=\"removeDiv('referenceDiv',2);\"]"));
        removeReference.click();


        //Submit Button
        WebElement saveReferences = driver.findElement(
                By.xpath("//button[normalize-space()='Save References']"));
        saveReferences.click();


    }

    @Test
    void userGuide(){

        //First login
        login();

        WebElement userGuide = driver.findElement(By.linkText("User Guide"));
        userGuide.click();

    }

    @Test
    void logOut(){

        //First login
        login();

        WebElement logout = driver.findElement(By.cssSelector("a[href='/logout']"));
        logout.click();
    }
    @Test
    void Home(){
        //First login
        login();

        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
    }

    @Test
    //jobs portal
    void jobs(){
        WebElement jobs = driver.findElement(By.linkText("Jobs"));
        jobs.click();


        //All jobs option
        WebElement allJobs = driver.findElement(By.cssSelector("a[href='#all']"));
        allJobs.click();

        //Administrative
        WebElement administrative = driver.findElement(By.cssSelector("a[href='#administrative']"));
        administrative.click();

        //Academic
        WebElement academic = driver.findElement(
                By.cssSelector("a[href='https://www.northsouth.edu/all-career-at-nsu']"));
        academic.click();

    }


    @AfterAll
    public void closeDriver(){

    }







}















