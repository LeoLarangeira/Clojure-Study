(ns basic-study.core
  (:gen-class)
  (:require [basic-study.log-level.exer :as lg]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (lg/message "[ERROR]: Stack overflow")
  (lg/log-level "[ERROR]: Stack overflow")
  (lg/reformat "[ERROR]: Stack overflow"))
