(ns basic-study.bob.exer
  (:gen-class)
  (:require [clojure.string :as str]))

(defn question? [s]
  ( = \? (last (str/trim s))))

(defn upper? [s]
  (= s (str/upper-case s)))

(defn is-empty?[s]
  (= "" (str/trim s)))



(defn response-for [s]
  (cond 
    (and (question? s) (upper? s) (not (nil? (re-seq #"[A-Za-z]" s)))) "Calm down, I know what I'm doing!"
    (question? s) "Sure."
    (is-empty? s) "Fine. Be that way!"
    (and (upper? s) (not (nil? (re-seq #"[A-Za-z]" s)))) "Whoa, chill out!"
    :else "Whatever."
    ) 
  )



