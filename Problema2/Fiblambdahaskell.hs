tribs = map fst (iterate f (0,1)) where f (x,y) = (y,x+y)
--fibs = fst <$> iterate (\(a,b) -> (b,a+b))  (0,1)
main = do
    print "Meta un numero para la serie"
    num <- getLine
    print(take (read num) tribs)