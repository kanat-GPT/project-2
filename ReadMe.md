#1 my first fail is when i put the number like 21334 the cod's out put give me "жыйырма мин мин уч жуз оттуз торт" instead "жыйырма бир мин уч жуз оттуз торт "![img.png](img.png)
#2 how i fix my fail
1. Previously, "миң " was always added after the tens of thousands, even if there was already a thousands part.
   • For example, 21 453 would be processed as "жыйырма миң ", then "бир миң ", leading to “жыйырма миң миң бир миң” (incorrect).
2. Now:
   • If the remaining part after tens of thousands is 1,000 or more (remainder >= 1000), "миң " is not added immediately, since it will be handled later in the thousands processing.
   • If the remainder is less than 1,000, "миң " is added right away.

Example Output:

Input Number Old Output New Output
21 453 жыйырма миң миң төрт жүз элүү үч жыйырма бир миң төрт жүз элүү үч
30 002 отуз миң миң эки отуз миң эки
45 600 кырк беш миң миң алты жүз кырк беш миң алты жүз

Now, the program correctly handles numbers in the 20,000 - 99,999 range without repeating "миң".
![img_1.png](img_1.png)
 #3 then after all this works i finished my project 
and thi my documentation of my project:
Sure! Below is the documentation for your **Number to Text Converter** Java program that converts numbers between 0 and 99999 to their Kyrgyz written forms. The documentation is aligned with the criteria you provided:

---

# **Project: Number to Text Converter in Kyrgyz**

## **Description:**
This project involves creating a Java program that converts numeric values (ranging from 0 to 99999) into their corresponding written forms in the Kyrgyz language. The program supports the full conversion of numbers, ensuring the output adheres to correct grammatical structure in Kyrgyz.

---

## **Functionality:**

### **Input:**
- **User Input**: The user is prompted to enter a number between 0 and 99999. This is done through the console using the `Scanner` class.
- **Input Validation**: The program checks if the number entered is within the valid range (0 to 99999). If the number is out of range, the user is shown an error message.

### **Conversion Logic:**
The program converts the number to its Kyrgyz text equivalent by breaking it down into individual parts based on its structure (thousands, hundreds, tens, and units).

- **Units (0-9)**: Translated to words such as "нөл" (0), "бир" (1), etc.
- **Tens (10-99)**: Uses words such as "он" (10), "жыйырма" (20), etc., applying appropriate grammar for numbers between 10 and 99.
- **Hundreds (100-999)**: Words like "жүз" (100), "эки жүз" (200), etc., are used to express the hundreds.
- **Thousands (1000-9999)**: Words like "миң" (thousand) are used, and the program handles numbers up to 99999.

The logic ensures proper placement of each part and correct grammar (e.g., numbers such as 11-19 have special handling).

### **Output:**
- **Printed Output**: The program outputs the number as a string in Kyrgyz, clearly displaying the converted value.
   - Example Input: `1234`
   - Example Output: `бир миң эки жүз отуз төрт`

