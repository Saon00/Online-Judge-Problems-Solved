/* Question: https://www.hackerrank.com/challenges/weather-observation-station-6/problem?h_r=next-challenge&h_v=zen
answer credit: @eternal
*/

SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";

/* Some references:
https://stackoverflow.com/questions/36627613/sql-query-to-check-if-a-name-begins-and-ends-with-a-vowel
https://www.sqlshack.com/t-sql-regex-commands-in-sql-server/
*/
