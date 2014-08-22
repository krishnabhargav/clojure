(ns learning.joy)


(+ 1 2)

'(12 12 23 3)

;; anonymous function
((fn [x y] (+ x y)) 20 40)

(defn countx [sq]
  (loop [x 0
         curr sq]
    (if (empty? curr) x
        (recur (inc x) (rest curr)))))

(countx (range 0 200))

(defn count-down [n]
  (do 
    (println "Number : " n)
    (when (pos? n)
    (recur (dec n)))))

(defn count-down-2 [n]
  (do 
    (println "Method Started")
    (loop [a n]
      (println "Number : " a)
      (when (pos? a) (recur (dec a))))))

(defn factorial [n]
  (loop [num (biginteger n)
         acc 1]
    (if (zero? num) acc 
        (recur (dec num) (* acc num)))))

(factoria 5)
