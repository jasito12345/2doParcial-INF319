tribo::Integer->Integer
tribo 0 = 0
tribo 1 = 1
tribo 2 = 1
tribo n = tribo(n-1) + tribo(n-2) + tribo(n-3)
tribo1 :: [Integer]
tribo1= [tribo n | n <- [0..]]


tribo2 :: [Integer]
tribo2 = aux 0 1 1
    where aux x y z= x : aux y z (x+y+z)
