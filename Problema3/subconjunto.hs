subconjunto :: Eq a => [a] -> [a] -> Bool
subconjunto []     _ = True
subconjunto (x:xs) ys = elem x ys && subconjunto xs ys

main :: IO()
main=do
    print(subconjunto [1,5,8,7] [1,5,2,8,6,7,4]  )
    print(subconjunto [1,4,8] [1,2,4,6]  )