# groceries



We will have 2 slots to make the tests run. 

If you finished earlier there will be some bonus tasks where you will have to 

define the tests yourself. 

Lets get started. You are at the grocery store



1) You want to purchase some groceries, each item has a price that you have to pay.

   Calculate the purchased sum. 

   

| Artikel/item    |   Price

------------------------------

| orangejuice	  |    2,00

| choclate   	  |    1,50

| coffee		  |    3,00

| eggs			  |    2,00

_______________________________





2x O-juice, 1x choclate, 3x coffee -->  2x 2,00€ + 1x 1,50 € + 3x 3,00 € = 14,50 €

2x choclate, 2x orange-juice       -->  2x 1,50€ + 2x 2,00,€             = 7,00 €



2) You want to purchase some groceries. But this time there are some discount on the items.

	Calculate the sum. 

   

| Artikel/item    |   Price	  |   Discount

-------------------------------------------

| orangejuice	  |    2,00   |      10%

| choclate   	  |    1,50   |      10%

| coffee		  |    3,00   |      -

| eggs			  |    2,00   |      15%

___________________________________________





2x O-juice, 1x choclate, 3x coffee -->  2x 1,80€ + 1x 1,35 € + 3x 3,00   = 13,95 €

2x eggs, 2x orange-juice           -->  2x 1,70€ + 2x 1,80,€             = 7,00 €



3) You want to purchase some groceries. But this time there are special offers after calculating 

     the discounts. Calculate the sum. 

   

| Artikel/item    |   Price	  |   Discount  | special offer

-----------------------------------------------------------------------------------------

| orangejuice	  |    2,00   |      10%    | buy 2 get 1 free

| choclate   	  |    1,50   |      10%    | Purchased sum>10€ --> 1 choclate free

| coffee		  |    3,00   |      -  	| buy 3 get 1 free

| eggs			  |    2,00   |      15%	| -

_________________________________________________________________________________________





2x O-juice, 1x chocolate, 3x coffee ->  1x 1,80€ + 0x 1,35 € + 2x 3,00 € = 10,80 €

2x eggs, 4x O-juice, 3x chocolate   ->  2x 1,70€ + 2x 1,80,€ + 3x 1,35 € = 11,05 € (+ 1 choclate for free)





4) Bonus Tasks

Adapt your methods and the tests, so you only have a solve method instead of 

solve, solve-discount and solve-special-offer. The tests should return the same 

values as before. 



instead of just returning the sum, return also an info about how much you saved when you

purchased your items and how many bars of choclate you got. Write some tests first!!!





## Usage



FIXME


