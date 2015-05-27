class CreateDevices < ActiveRecord::Migration
  def change
    create_table :devices, id: :uuid  do |t|
      t.string :registration_id
      t.timestamps null: false
    end
    add_index :devices, :registration_id
  end
end
