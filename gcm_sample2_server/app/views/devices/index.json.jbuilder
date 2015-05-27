json.array!(@devices) do |device|
  json.extract! device, :id, :registration_id
  json.url device_url(device, format: :json)
end
