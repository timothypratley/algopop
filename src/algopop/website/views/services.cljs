(ns algopop.website.views.services)

(defn services-page []
  [:div
   [:div.jumbotron
    [:h2 "Services"]
    [:p "Like our approach? Let's collaborate on your next money maker."]]
   [:div
    [:h3 "Data ETL and data-mining"]
    [:p "If you have data locked away, we can liberate it.
Our data scientists are available to extract valuable information from your existing data."]
    [:h3 "Prototyping"]
    [:p "We recommend our one week system prototype programme for new clients.
The more ambitious the idea, the better."]
    [:h3 "Custom Assemblies"]
    [:p "We assemble custom solutions with synergistic clients.
If you have a vision, we are the right partner to make it happen."]
    [:h3 "Training"]
    [:p "We run workshops tailored to your team and project.
Typical ciriculums span three days of intensive instruction, coursework, and one-on-one pairing."]]])
