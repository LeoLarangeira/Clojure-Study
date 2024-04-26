(ns basic-study.raindrops.exer
  (:gen-class))

(defn is-divisible-by-three? [number]
  (= (rem number 3) 0))
(defn is-divisible-by-five? [number]
  (= (rem number 5) 0))
(defn is-divisible-by-seven? [number]
  (= (rem number 7) 0))
(defn is-both-divisible? [number]
  (= (or (or (is-divisible-by-three? number) (is-divisible-by-seven? number)) (is-divisible-by-five? number)) true))


(defn convert [number] ;; <- arglist goes here
      ;; your code goes here 
  (let [n (str number)
        num number]
    (println n)
    (cond
      (is-both-divisible? num) n
      (is-divisible-by-three? num) "Pling"
      (is-divisible-by-five? num) "Plang"
      (is-divisible-by-seven? num) "Plong")))
