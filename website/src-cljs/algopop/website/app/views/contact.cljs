 (ns algopop.website.app.views.contact)

(defn contact-page []
  [:div
   [:div.jumbotron
    [:h2 "Let's talk."]
    [:p "We are here to make your new webapp pop."]]
   [:div
    [:dl.dl-horizontal
     [:dt "General"] [:dd "1-313-288-9881"]
     [:dt "Sales and Support"] [:dd "1-313-288-9883"]
     [:dt "Email"] [:dd "timothypratley@gmail.com We answer all emails within one business day"]
     [:dt "Address"] [:dd "Level 2, Orion Building, 2743 California Ave SW, Seattle, WA 98116"]]]])
