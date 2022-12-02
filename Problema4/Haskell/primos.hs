factores :: Int -> [Int]
factores n = [x | x <- [1..n], n `mod` x == 0]

esPrimo :: Int -> Bool
esPrimo 1 = True
esPrimo n = factores n == [1,n]

main = do 
    putStrLn "Cuantos primos se buscará? "
    dato <- getLine
    let serie = read dato::Int
    print (take serie [x | x <- [1..], esPrimo x])