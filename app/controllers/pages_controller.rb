class PagesController < ApplicationController
  def index
  end
  def home
  end
  def about
  end

  def planner
    render locals: {data: params}
  end

  def schedule
  end
  def confirm
    render locals: {data: params, uber_price: 13.5}
  end

  def end
    # self.class.get("javaserver:3000/save", {longitude: 12.13, latitude: 123.12, user: 'sdsadsadsa123213213'}
  end
end