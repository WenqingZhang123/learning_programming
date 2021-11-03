{-
1....
2.....
-}

{-
3.
halve :: [a] -> ([a],[a])
halve  x = (take xs x, drop xs x)
    where 
        xs = div (length x) 2
-}

{-
4.
euclidean :: (Int,Int) -> (Int,Int) -> Float
euclidean (x1,y1) (x2,y2) = sqrt (fromInteger ((x1 - x2)^2 + (y1 - y2)^2))

-}

{-
5.
firstWord :: String -> String
firstWord x = takeWhile (/= ' ') (dropWhile (== ' ') x)
-}

{-
6.
safeTail :: [a] -> [a]
safeTail x = if null x then [] else xs
    where xs = tail x

safeTail' :: [a] -> [a]
safeTail' x | null x = []
           | otherwise = tail x
-}

{-
stack :: [a] -> [a]
stack [] = []
stack (x:xs) = xs ++ [x]

range :: (Num a, Ord a) => a -> Bool
range x = x > 0 && x < 10

addc :: Char -> String ->String
addc x xs = x:xs

halves :: Num a => [a] -> [a]
halves x = map (/2) x

capitalizeStart :: String -> String
capitalizeStart [] = []
capitalizeStart (c:cs)
    | isLower c = (toUpper c):cs
    | otherwise = c:cs
-}

{-
8.
oddItems :: (Fractional a, Integral a) =>[a] -> [a]
oddItems xs = filter isOdd xs
    where isOdd x = x `mod` 2.0 /= 0

-}


{-
9..
-}