
module Main where

shirts, pants, shoes, scarfs :: [String]


shirts = ["white shirt", "grey turtleneck", "pink polo", "green hoodie"]
pants = ["jeans", "khakis"]
shoes = ["brogues", "converse", "Sandals"]
scarfs = ["paisley", "knitloop"]


outfits :: [(String,String,String,String)]
outfits = [(x,y,z,a)| x <- shirts, y <- pants, z <- shoes, a <- scarfs]

lengthOfOutfits :: Int

lengthOfOutfits = length outfits

l :: [String]
l = ["Mr.", "Ms.", "Mrs.", "Dr.", "Prof.", "Rev."]

pairs :: [String]

pairs = [a | a <- l] ++ [a ++ " and " ++b| a <- l, b <- l]

lengthOfPairs :: Int
lengthOfPairs = length pairs

natoAlp :: [(Char,String)]

militaryWord :: [String]

wordPassed :: String
wordPassed = "DAY"

natoAlp = [('A',"Alfa"), ('B',"Bravo"), ('C',"Charlie"), ('D',"Delta"), ('E',"Echo"), ('F',"Foxtrot"), ('G',"Golf"), ('H', "Hotel"), ('I', "India"), ('J', "Juliett"), ('K', "Kilo"), ('L', "Lima"), ('M', "Mike"), ('N', "November"), ('O', "Oscar"), ('P', "Papa"), ('Q', "Quebec"), ('R', "Romeo"), ('S', "Sierra"), ('T',"Tango"), ('U',"Uniform"), ('V',"Victor"), ('W',"Whiskey"), ('X',"X-ray"), ('Y',"Yankee"), ('Z',"Zulu")]

militaryWord = [ snd(natoAlp !! x)  | x <- [0..25] , y <- wordPassed, y == fst(natoAlp !! x)]


findremainder x y = x `mod` y


isEven x = if x `mod` 2 == 0
			then True
			else False

merge :: Ord a => [a] -> [a] -> [a]
merge [] ys = ys
merge xs [] = xs
merge (x:xs) (y:ys) = if x < y
						then x:(merge xs (y:ys))
						else y:(merge (x:xs) ys)

removeMultiple :: [Int] -> Int -> [Int]
removeMultiple [] _ = []
removeMultiple (x:xs) a = if findremainder x a == 0
							then (removeMultiple xs a)
							else x:(removeMultiple xs a)


outfitss lst1 lst2 lst3 lst4 = [(x,y,z,a) | x <- lst1, y <- lst2, z <- lst3, a <- lst4]

honorifics l = [a | a <- l] ++ [a ++ " and " ++b| a <- l, b <- l]

nato word = [snd(natoAlp !! x)  | y <- word, x <- [0..25] ,  y == fst(natoAlp !! x)]


main = do
--mapM_ print militaryWord


putStr "The total number of possible outfits is: "
print lengthOfOutfits


putStr "The total possible number of combinations of prefixes is :"
print lengthOfPairs





-- Original Number of Outfits: 24

-- It makes more sense to buy one more shirt rather than buy the other articles since there are 
-- already so many shirts one more short doesnt make the number of combos increase but much
-- pants and shoes would yield the largest amount of increase in outfits

-- Number of outfits after adding scarfs = 48

-- The total possible number of combinations of prefixes from the test list is :36



