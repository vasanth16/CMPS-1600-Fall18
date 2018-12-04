
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

pairs = [a , b , a++"and"++ b, b++"and"++a | a <- l, b <- l]

lengthOfPairs :: Int
lengthOfPairs = length pairs


main = do
--putStrLn "Hello World"

--mapM_ print outfits

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



