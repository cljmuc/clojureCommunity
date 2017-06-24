(ns mirror.test
  (:require [clojure.test :refer :all]
            [mirror.core :refer :all]))

(defn check [act exp]
  (is (= act exp)))

(deftest vertical-test
  (testing "vertical-mirror"  
    
    (let [input "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
          solution "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"]
     (is (= solution (vertical input))))
    
    (let [input "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
          solution "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"]
      (is (= solution (vertical input))))
      
    (let [input "cuQW\nxOuD\nfZwp\neqFx"
           solution "WQuc\nDuOx\npwZf\nxFqe"]
      (is (= solution (vertical input))))
      
    (let [input "CDGIdolo\nUstXfrIg\ntMqjvxWL\nBEyuCnAm\nxsxaEERa\nxZsvOiZS\nLutlBRXE\ntxshhbqE"
          solution "olodIGDC\ngIrfXtsU\nLWxvjqMt\nmAnCuyEB\naREEaxsx\nSZiOvsZx\nEXRBltuL\nEqbhhsxt"]
      (is (= solution (vertical input))))))
    
    

(deftest horizontal-test
   (testing "horizontal-mirror"  
    
    (let [input "lVHt\nJVhv\nCSbg\nyeCt"
          solution "yeCt\nCSbg\nJVhv\nlVHt"]
     (is (= solution (horizontal input))))
    
    (let [input "njMK\ndbrZ\nLPKo\ncEYz"
          solution "cEYz\nLPKo\ndbrZ\nnjMK"]
      (is (= solution (horizontal input))))
      
    (let [input "QMxo\ntmFe\nWLUG\nowoq"
          solution "owoq\nWLUG\ntmFe\nQMxo"]
      (is (= solution (horizontal input))))
      
    (let [input "FYvi\ndZQn\nuGef\nQoSy"
          solution "QoSy\nuGef\ndZQn\nFYvi"]
      (is (= solution (horizontal input))))))

