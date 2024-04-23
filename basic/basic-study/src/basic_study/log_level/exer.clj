(ns basic-study.log-level.exer
  (:gen-class)
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
   and returns its message with whitespace trimmed."
  [s]
  (println "[MESSAGE]") 
  (println (str/trim (last (str/split s #":")))))


(defn log-level
  "Takes a s representing a log line
   and returns its level in lower-case."
  [s]
  (println " ")
  (println "[LOG-LEVEL]")
  (println (str/lower-case (subs (first (str/split s #"]")) 1)))
  )


(defn reformat
  "Takes a s representing a log line and formats it
   with the message first and the log level in parentheses."
  [s] 
  (println " ")
  (println "[REFORMAT]")
  (println (str (message s) " (" (log-level s) ")")))
