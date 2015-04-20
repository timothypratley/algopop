(ns algopop.website.app.main
  (:require [algopop.website.app.communication :as communication]
            [algopop.website.app.views.header :as header]
            [algopop.website.app.views.home :as home]
            [algopop.website.app.views.products :as products]
            [algopop.website.app.views.team :as team]
            [algopop.website.app.views.contact :as contact]
            [algopop.website.app.views.clients :as clients]
            [algopop.website.app.views.quality :as quality]
            [algopop.website.app.views.services :as services]
            [reagent.core :as reagent]
            [reagent.session :as session]
            [secretary.core :as secretary :include-macros true]
            [goog.events :as events]
            [goog.history.EventType :as EventType]
            [cljsjs.react :as react])
  (:import goog.History))

;; -------------------------
;; Routes

(def page {:home #'home/home-page
           :quality #'quality/quality-page
           :contact #'contact/contact-page
           :clients #'clients/clients-page
           :products #'products/products-page
           :services #'services/services-page
           :team #'team/team-page})

(defn current-page []
  [:div.container
   [header/header]
   [:div.well
    [(page (session/get-in [:viewpoint :current-page]))]]])

(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
  (session/assoc-in! [:viewpoint :current-page] :home))
(secretary/defroute "/quality" []
  (session/assoc-in! [:viewpoint :current-page] :quality))
(secretary/defroute "/contact" []
  (session/assoc-in! [:viewpoint :current-page] :contact))
(secretary/defroute "/clients" []
  (session/assoc-in! [:viewpoint :current-page] :clients))
(secretary/defroute "/products" []
  (session/assoc-in! [:viewpoint :current-page] :products))
(secretary/defroute "/services" []
  (session/assoc-in! [:viewpoint :current-page] :services))
(secretary/defroute "/team" []
  (session/assoc-in! [:viewpoint :current-page] :team))
(secretary/defroute "*" []
  (session/assoc-in! [:viewpoint :current-page] :home))

;; TODO: reflect

;; -------------------------
;; History
;; must be called after routes have been defined

(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (hook-browser-navigation!)
  (mount-root))
