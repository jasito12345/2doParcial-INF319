fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib 2 = 1
fib n = fib (n-1) + fib (n-2) + fib (n-3)


fibs1 :: [Integer]
fibs1 = [fib n | n <- [0..]]