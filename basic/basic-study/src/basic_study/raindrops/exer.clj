(ns basic-study.raindrops.exer
  (:gen-class))

(defn is-divisible-by-three? [number]
  (= (rem number 3) 0))
(defn is-divisible-by-five? [number]
  (= (rem number 5) 0))
(defn is-divisible-by-seven? [number]
  (= (rem number 7) 0))
(defn is-not-divisible? [number]
  (not (or (is-divisible-by-three? number)
           (is-divisible-by-five? number)
           (is-divisible-by-seven? number))))


(defn convert [number]
  (let [result (cond
                 (is-not-divisible? number) (str number)
                 (is-divisible-by-three? number) "Pling"
                 (is-divisible-by-five? number) "Plang"
                 (is-divisible-by-seven? number) "Plong")]
    (if (empty? result)
      (str number) ; fallback caso nenhum dos casos anteriores seja atendido
      result)))
