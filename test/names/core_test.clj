(ns names.core-test
  (:require [clojure.test :refer [deftest is]]
            [names.core :as names]))

(deftest user-name-test
  (is (= "John" (names/user-name {:name "John"})))
  (is (= "Jane" (names/user-name {:name "Jane" :id 1})))
  (is (nil? (names/user-name {}))))
