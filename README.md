# Selenium-Work
 
<h1>Booking Filter Test</h1>

<p>This project involves the testing of the search filters of the "Booking.com" website where new choices are included in the filters, i.e. Star Rating.
This is done by using the Selenium WebDriver where the test code is written in Java through the use of the Eclipse.<p>
Multiple test scenarios are performed for the filter options where test data can be used for the filters including the locaton, dates, number of people, the room and if the hotel is listed within the filters.
<p>The browser which is used for this testing project is "Firefox" by using the Gecko Driver and applying this to the Eclipse project.</p>
 
<h2>Prerequisites</h2>
<h3>Install Eclipse</h3>
<ul>
 <li>Open a preferred browser, e.g. Chrome, Firefox.</li>
 <li>Go to <a href="https://www.eclipse.org/downloads/" rel="nofollow">https://www.eclipse.org/downloads/</a></li>
 <li>Press the Download button under "Get Eclipse IDE..."</li>
 <li>Click on the .exe file for Eclipse in the Downloads folder of the laptop / desktop once the download is finished.</li>
 <li>Run the executable (.exe) file by pressing the Run button.</li>
 <li>Press the "Eclipse IDE for Java Developers" button to install that Eclipse application.</li>
 <li>Click on the "Install" button.</li>
</ul>

 
<h3>Install Selenium WebDriver</h3>
<ul>
 <li>Open a preferred browser, e.g. Chrome, Firefox.</li>
 <li>Go to <a href="https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/"      rel="nofollow">https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/</a></li>
 <li>Choose whether to install the ChromeDriver for Google Chrome or the GeckoDriver for Firefox.</li>
 <li>If GeckoDriver is chosen, press the Downloads button in the quick reference section which is shown on screen after pressing the Selenium web link.</li>
 <li>In the GeckoDriver releases on Github <a href="https://github.com/mozilla/geckodriver/releases" rel="nofollow">https://github.com/mozilla/geckodriver/releases</a>, select the driver folder version compatible with the version of Chrome that is being used on the computer.
 <li>In the index of the version that is chosen, choose a zip file depending on if it is on Windows or Mac and the zip file is downloaded.</li>
 <li>After the download, click on the zip file to go to File Explorer.</li>
 <li>Extract the folder by right-clicking on the downloaded ChromeDriver zip folder.</li>
 <li>Move the folder to a suitable location on the desktop for linking the testing in Eclipse to the location of the driver on the desktop.</li>
</ul>

<h4>Alternatively if the GeckoDriver is chosen</h4>
<ul>
 <li>Open a preferred browser.</li>
 <li>Go to <a href="https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/"      rel="nofollow">https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/</a></li>
 <li>Choose whether to install the ChromeDriver for Google Chrome or the Gecko Driver for Firefox.</li>
 <li>If ChromeDriver is chosen, press the Downloads button in the quick reference section which is shown on screen after pressing the Selenium web link.</li>
 <li>In the GeckoDriver download on Github <a href="https://github.com/mozilla/geckodriver/releases" rel="nofollow">https://github.com/mozilla/geckodriver/releases</a>, select the preferred version of the driver, i.e. the latest version.
 <li>Scroll down to the Assets section of the driver to be downloaded</li>
 <li>In the Assets section of the chosen driver, click on the zip or tar.gz folder of the driver to be downloaded depending on whether Windows or Mac is used</li>
 <li>After the download, click on the zip file to go to File Explorer.</li>
 <li>Extract the folder by right-clicking on the downloaded GeckoDriver zip folder.</li>
 <li>Move the folder to a suitable location on the desktop for linking the testing in Eclipse to the location of the driver on the desktop.</li>
</ul>

<h2>Test Explanation</h2>
<p>The following files in the Eclipse project after this paragraph are explained regarding their roles in the testing of the filter options.</p>

<h3>First_Test.java</h3>

This Java file features the initial testing of the Selenium WebDriver to navigate the user to the "Booking.com" website on Firefox before dealing with the search filtering on the "Booking.com" website in the tests that follow.
