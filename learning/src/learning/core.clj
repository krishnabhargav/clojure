(ns learning.core)

(defn blank? [str]
  (every? #(Character/isWhitespace %) str))


(defn empty2? [string]
    (every? (fn [x] (Character/isWhitespace x)) string))

(empty2? "Krishna")

(defrecord Person [first-name last-name])

(->Person "Krishna" "Vangapandu")

(defn sum-of-squares [x y]
  (let [x-square (* x x)
        y-square (* y y)]
    (+ x-square y-square)))

(sum-of-squares 2 3)

(defn destructure-map [{name "name" :as keys}]
  (str name (keys :age)))

(destructure-map {"name" "Krishna" :age 30})

(defn destructure-vector [[x y]]
  [x y])

(destructure-vector (range 0 20))

(keyword "name")

(defn allFiles [path]
  (file-seq (clojure.java.io/file path)))

(def clojure (allFiles "/Users/bhargava/workspace/clojure"))

(def justfiles (filter #(-> % .isDirectory not) clojure))
(def path (.toPath (first justfiles)))
(java.nio.Files/readAttributes )
(type java.nio.file.attribute/BasicFileAttribute)

(Math/sqrt 9)

(defn first5 [items]
  (let [[a1 a2 a3 a4 a5 &more :as all] items]
    [(count all) a1 a2 a3 a4 a5]))

(first5 (range 200))

(def person { :first "Krishna" :middle "Bhargava" :last "Vangapandu"})

(defn first-name [person]
  (let [{f-name :first} person] 
    f-name))

(defn first-name2 [{f :first}]
  f)

(first-name2 person)
