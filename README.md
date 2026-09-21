
## JAVA FRAMEWORKS
## Raina Schwanz
> B) Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

> C) Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
>> mainscreen.html
>>
>> line 13 - Changed the title to "The Phone Doctor"
>>
>> line 16 - Added a h1 site title to "The Phone Doctor"
>>
>> line 19 - Changed the h1 title to "Home"
>>
>> line 21 - Changed the h2 title to "Replacement Parts"
>>
>> line 53 - Changed the h2 title to "Repairs and Installs"


> D) Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
>> mainscreen.html
>>
>> line 14 - linked mainscreen.html to demo.css
>>
>> lines 17-25 - Created a header that includes the site title and navigation to the about.html and mainscreen.html pages
>
>> about.html
>>
>> created about.html
>>
>> lines 1-25 were copied from mainscreen.html so both pages have the same header
>>
>> line 21 & 22 - Changed the active link to the about.html page
>>
>> lines 26 - 33 - Added an About h1 title and a paragraph about the company
>
>> demo.css
>>
>> lines 1-37 - Added styles for the header and navigation
>
>> aboutController.java
>>
>> created aboutController.java
>>
>> line 6 - Added @Controller annotation
>>
>> line 8-11 - created a method that returns the about.html page

> E) Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
>> BootStrapData.java
>>
>> lines 59-116 - Added 5 parts to the part repository, updated part names and prices on 11/18/25
>>
>> line 117-139 - Added 5 products to the product repository, updated product names and prices on 11/18/25
>> 
>> application.properties
>>
>> line 6 - Added a number to the end of the database name to make it unique, updated the database name on 11/18/25

> F) Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
>  - The “Buy Now” button must be next to the buttons that update and delete products.
>  - The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
>  - Display a message that indicates the success or failure of a purchase.
>> mainscreen.html
>>
>> line 58 - Added the buy now button for parts
>>
>> line 95 - Added the buy now button for products
>>
>> AddProductController.java
>> 
>> lines 176-195 - Created a method that decrements the inventory of the product by one and if there is not enough inventory, it return the Failure.html page and if it is successful, it returns the Success.html page
>>
>> Success.html
>>
>> created Success.html
>>
>> line 12 - Added a h1 title that says "Purchase Successful!"
>>
>> line 14 - Created a link to the main screen
>>
>> Failure.html
>>
>> created Failure.html
>>
>> line 12 - Added a h1 title that says "Purchase not successful!"
>>
>> line 14 - Created a link to the main screen
>>
>> AddPartController.java
>>
>> lines 176-195 - Created a method that decrements the inventory of the part by one and if there is not enough inventory, it return the Failure.html page and if it is successful, it returns the Success.html page

> G) Modify the parts to track maximum and minimum inventory by doing the following:
> - Add additional fields to the part entity for maximum and minimum inventory.
> - Modify the sample inventory to include the maximum and minimum fields.
> - Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
> - Rename the file the persistent storage is saved to.
> - Modify the code to enforce that the inventory is between or at the minimum and maximum value.
>> Part.java
>>
>> lines 33-38 - Added maximum and minimum inventory fields
>>
>> lines 67-76- Added getters and setters for maximum and minimum inventory fields
>>
>> line 23 - Added the @ValidInventory to link the validator to the part entity
>> mainscreen.html
>>
>> lines 47, 48, 57, 58 - Added the maximum and minimum inventory fields to the part table
>>
>> BootStrapData.java
>>
>> lines 70, 71, 83, 84, 96, 97, 109, 110, 123, 124 - Added the maximum and minimum inventory fields to each part
>>
>> application.properties
>>
>> line 6 - Renamed the file the persistent storage is saved to
>>
>> InhousePartForm.html
>>
>> lines 24-30 - Added the maximum and minimum inventory text fields
>>
>> lines 16, 18, 21, 24 - Added field labels for Name, Price, ID, and Inventory
>>
>> lines 33-37 - Added code that checks for any errors  
>>
>> OutsourcedPartForm.html
>>
>> lines 12-14 - Added the maximum and minimum inventory text fields
>>
>> lines 17, 19, 22, 25 - Added field labels for Name, Price, and Inventory, Company Name
>>
>> lines 33-37 - Added code that checks for any errors
>>
>> InventoryValidator.java
>>
>> created InventoryValidator.java
>>
>> Lines 31-40 - Created an if statement that checks if the inventory is between or at the minimum and maximum value
>>
>> ValidInventory.java
>>
>> created ValidInventory.java
>>
>> Line 16 - Created a class that implements the Validator interface
>>
>> Line 20 - Added "Inventory Error!" message  


> H) Add validation for between or at the maximum and minimum fields. The validation must include the following:
> - Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
> - Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
> - Display error messages when adding and updating parts if the inventory is greater than the maximum.
>> InventoryValidator.java
>>
>> Line 34 & 38 - Corrected typo
>>
>> EnufPartsValidator.java
>>
>> Lines 36-39 - Corrected if statement to check if the inventory is below the minimum for parts when adding or updating products
>>
>> confirmationaddpart.html
>>
>> Line 5 - Changed refresh rate from 0 to 5 seconds so user can see the message.
>>
>> confirmationaddproduct.html
>>
>> Line 5 - Changed refresh rate from 0 to 5 seconds so user can see the message.
>>
>> confirmationassocpart.html
>>
>> Line 5 - Changed refresh rate from 0 to 5 seconds so user can see the message.
>>
>> productForm.html
>>
>> lines 17, 19, 22 - Added field labels for Name, Price, and Inventory
>>
>> application.properties
>>
>> line 6 - Renamed the file the persistent storage is saved to
>>
> I) Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
>> PartTest.java
>>
>> lines 103-138 - Added tests for the maximum and minimum fields
>>
> J) Remove the class files for any unused validators in order to clean your code.
>> DeletePartValidator.java and ValidDeletePart.java
>>
>> Deleted unused validators
>>
>> Part.java
>>
>> line 18 - Removed the call and import for the unused validators in Part.java
