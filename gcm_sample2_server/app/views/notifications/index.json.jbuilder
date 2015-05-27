json.array!(@notifications) do |notification|
  json.extract! notification, :id, :title, :message
  json.url notification_url(notification, format: :json)
end
