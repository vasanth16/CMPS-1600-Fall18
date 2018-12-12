--Tullia Glaeser and Vasanth Rajasekaran
--Lab: Tuesday 5-6:15pm
--Parisa Kordjamshidi
--7 December 2018

--2
--a)
remainder x y = x `mod` y

--b)
isEven x = if x `mod` 2 == 0
			then True
			else False

--c)
merge :: Ord a => [a] -> [a] -> [a]
merge [] ys = ys
merge xs [] = xs
merge (x:xs) (y:ys) = if x < y
						then x:(merge xs (y:ys))
						else y:(merge (x:xs) ys)

--d)
removeMultiple :: [Int] -> Int -> [Int]
removeMultiple [] _ = []
removeMultiple (x:xs) a = if remainder x a == 0
							then (removeMultiple xs a)
							else x:(removeMultiple xs a)

--3
--1: outfits
outfits lst1 lst2 lst3 lst4 = [(x, y, z, q) | x <- lst1, y <- lst2, z <- lst3, q <- lst4]

--2: honorifics
honorifics lst = [i | i <- lst] ++ [j ++ " and " ++ k | j <- lst, k <- lst]

--3: NATO
alph = [('A', "Alfa"), ('B', "Bravo"), ('C', "Charlie"), ('D', "Delta"), ('E', "Echo"), ('F', "Foxtrot"), ('G', "Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T', "Tango"), ('U', "Uniform"), ('V', "Victor"), ('W', "Whiskey"), ('X', "X-ray"), ('Y', "Yankee"), ('Z', "Zulu")]
nato wrd = [snd (alph !! y) | x <- wrd, y <- [0..25], x == fst(alph !! y)]

--3: Validating Credit Card Numbers
--Ex 1:
lastDigit :: Integer -> Integer
lastDigit a = a `rem` 10

dropLastDigit :: Integer -> Integer
dropLastDigit a = a `div` 10

--Ex 2:
--breaking a # into a list of its digits in reverse order is easier b/c this way you can simply use the remainder and divide functions
toRevDigits :: Integer -> [Integer]
toRevDigits a
	| a < 1 = []
	| otherwise = [lastDigit (a)] ++ toRevDigits (dropLastDigit a)

toDigits :: Integer -> [Integer]
toDigits n = reverse(toRevDigits n)

--Ex. 3:
doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther [] = []
doubleEveryOther [z] = [z]
doubleEveryOther (x:y:z) = x:(2 * y):(doubleEveryOther z)

--Ex. 4:
sumDigits :: [Integer] -> Integer
sumDigits [] = 0
sumDigits (x:xs) = sumDigits xs + lastDigit x + dropLastDigit x

--Ex 5:
--no, don't have to account for the fact that doubleEveryOther gives a list in reverse order b/c after doubling, we simply have to add the digits and order doesn't matter here
luhn :: Integer -> Bool
luhn a = if (sumDigits((doubleEveryOther (toRevDigits a))) `rem` 10) == 0
	then True
	else False
