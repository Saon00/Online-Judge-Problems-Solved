/* Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
https://www.hackerrank.com/challenges/weather-observation-station-9/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

SELECT DISTINCT city FROM station WHERE city NOT REGEXP "^[aeiou].*";

/* Resources
https://stackoverflow.com/questions/49228926/get-city-name-either-do-not-start-with-vowels-or-do-not-end-with-vowels
*/
