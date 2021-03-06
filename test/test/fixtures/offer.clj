(ns test.fixtures.offer
  (:use darkexchange.database.util)
  (:require [test.init :as test-init]
            [test.fixtures.user :as user-fixture]
            [test.fixtures.util :as fixtures-util])
  (:import [java.util Date]))

(def records [
  { :id 1
    :created_at (new Date)
    :user_id 1
    :foreign_offer_id nil
    :closed nil
    :has_amount 1.0
    :has_currency "BITCOIN"
    :has_payment_type "BITCOIN"
    :wants_amount 1.0
    :wants_currency "USD"
    :wants_payment_type "CAM" }])

(def fixture-table-name :offers)

(def fixture-map { :table fixture-table-name :records records :required-fixtures [user-fixture/fixture-map] })