# Reverse an array without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

### Prerequisite
* Ensure you have Java 8 installed ,


#### Using O(n). we do it through the below number of steps
* 1) Let input string as 'str[]' and length of string be 'n'
* 2) Initialize 
        ```sh
        l = 0, r = n-1 , Where l is left and r is right.
        ```
* 3) While l is smaller than r, do following
    a) If str[l] is not an alphabetic character, do l++
    b) Else If str[r] is not an alphabetic character, do r--
    c) Else swap str[l] and str[r]

        ```sh
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l])) {
                l++;
            } else if (!Character.isAlphabetic(str[r])) {
                r--;
            } 
            else { // Both str[l] and str[r] are not spacial characters
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
        ```


License
----

Owori Juma





