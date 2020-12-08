/* Question: https://www.hackerrank.com/challenges/weather-observation-station-6/problem?h_r=next-challenge&h_v=zen
answer credit: @eternal
*/

SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";
