(ns basic-study.coordinate-transformation.exer
  (:gen-class)
  (:require [clojure.string :as str]))

(defn translate2d
  "Returns a function making use of a closure to
   perform a repeatable 2d translation of a coordinate pair."
  [dx dy]
  (fn [x y]
    (mapv + [x y] [dx dy])))

(defn scale2d
  "Returns a function making use of a closure to
   perform a repeatable 2d scale of a coordinate pair."
  [sx sy]
  (fn [x y]
    (mapv * [x y] [sx sy])))

(defn compose-transform
  "Create a composition function that returns a function that 
   combines two functions to perform a repeatable transformation."
  [f g])

(defn memoize-transform
  "Returns a function that memoizes the last result.
   If the arguments are the same as the last call,
   the memoized result is returned."
  [f]
  (let [result (atom nil)
        args (atom nil)]
    (fn [& new-args]
      (if (= @args new-args)
        @result)
      (do 
        (reset! args new-args)
        (reset! args (apply f new-args))))))