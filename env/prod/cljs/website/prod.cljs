(ns algopop.website.prod
  (:require [algopop.website.app.main :as main]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(main/init!)
