import Data.List
import Data.Array

fib2 :: Integer -> Integer
fib2 n = (vectorFib2 n) ! n

vectorFib2 :: Integer -> Array Integer Integer
vectorFib2 n = v where
  v = array (0,n-1) [(i,f i) | i <- [0..n-1]]
  f 0 = 0
  f 1 = 1
  f 2 = 1
  f n = v!(n-1) + v!(n-2) + v!(n-3)