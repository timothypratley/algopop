(ns algopop.website.app.views.header
  (:require [reagent.session :as session]))

(defn header []
  [:header
   [:nav.navbar.navbar-inverse {:role "navigation"
                                :style {:background-image "url('img/title_background.jpg')"}}
    [:div.container-fluid
     [:div.navbar-header
      [:button.navbar-toggle {:type "button"
                              :data-toggle "collapse"
                              :data-target "navbar-collapse"}
       [:span.sr-only "Toggle navigation"]
       [:span.icon-bar]
       [:span.icon-bar]
       [:span.icon-bar]]
      [:a.navbar-brand {:href "#"}
       [:kbd
        [:img {:src "img/brand.png"
               :height "40px"}]
        "  Algopop"]]]
     [:div.collapse.navbar-collapse {:id "navbar-collapse"}
      [:ul.nav.navbar-nav.navbar-right
       #_(when-not (session/get :open?)
         [:li
          [:p.navbar-text
           [:span.glyphicon.glyphicon-exclamation-sign]
           " Disconnected from server."]])
       [:li [:a {:href "#/quality"} [:kbd "quality"]]]
       [:li [:a {:href "#/clients"} [:kbd "clients"]]]
       [:li [:a {:href "#/products"} [:kbd "products"]]]
       [:li [:a {:href "#/services"} [:kbd "services"]]]
       [:li [:a {:href "#/team"} [:kbd "team"]]]
       [:li [:a {:href "#/contact"} [:kbd "contact"]]]
       #_(let [username "tim"]
         (when username
           [:li.dropdown
            [:a.dropdown-toggle {:href "#"
                                 :data-toggle "dropdown"}
             [:kbd
              [:span.glyphicon.glyphicon-user]
              (str " " username)
              [:span.caret]]]
            [:ul.dropdown-menu {:role "menu"}
             [:li [:a {:href "#"} "preferences"]]
             [:li [:a {:href "#"} "logout"]]]]))]]]]])
