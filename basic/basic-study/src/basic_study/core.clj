(ns basic-study.core
  (:gen-class)
  (:require [basic-study.log-level.exer :as lg]
            [basic-study.bob.exer :as bob]
            [basic-study.coordinate-transformation.exer :as cf]
            [basic-study.raindrops.exer :as rain]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (rain/is-not-divisible? 57))
  (println (rain/convert 21))
  (println (rain/convert 35))
  (println (rain/convert 7))
  (println (rain/convert 52)))
